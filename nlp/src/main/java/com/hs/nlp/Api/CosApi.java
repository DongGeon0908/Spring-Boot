package com.hs.nlp.Api;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CosApi {

    // Cos(String, String) -> double 반환
    public Double Cos(String A, String B) {

        WiseNLUApi wiseNLUApi = new WiseNLUApi();

        A = A.toLowerCase();
        B = B.toLowerCase();

        Map<String, Integer> tmp1 = wiseNLUApi.WiseNLU(A);
        Map<String, Integer> tmp2 = wiseNLUApi.WiseNLU(B);

        HashMap<CharSequence, Integer> leftVector = new HashMap<CharSequence, Integer>(tmp1);
        HashMap<CharSequence, Integer> rightVector = new HashMap<CharSequence, Integer>(tmp2);

        for (String s : tmp1.keySet()) {
            if (!rightVector.containsKey(s)) {
                rightVector.put(s, 0);
            }
        }

        for (String s : tmp2.keySet()) {
            if (!leftVector.containsKey(s)) {
                leftVector.put(s, 0);
            }
        }

        /*
        for (CharSequence cnp : leftVector.keySet()) {
            System.out.println(">> " + cnp + " >> " + leftVector.get(cnp));
        }

        for (CharSequence cnp : rightVector.keySet()) {
            System.out.println("<< " + cnp + " << " + rightVector.get(cnp));
        }
        */

        return Math.round(cosineSimilarity(leftVector, rightVector)*10000)/10000.0;
    }

    public Double cosineSimilarity(final Map<CharSequence, Integer> leftVector,
                                   final Map<CharSequence, Integer> rightVector) {
        if (leftVector == null || rightVector == null) {
            throw new IllegalArgumentException("Vectors must not be null");
        }
        final Set<CharSequence> intersection = getIntersection(leftVector, rightVector);
        final double dotProduct = dot(leftVector, rightVector, intersection);
        double d1 = 0.0d;
        for (final Integer value : leftVector.values()) {
            d1 += Math.pow(value, 2);
        }
        double d2 = 0.0d;
        for (final Integer value : rightVector.values()) {
            d2 += Math.pow(value, 2);
        }
        double cosineSimilarity;
        if (d1 <= 0.0 || d2 <= 0.0) {
            cosineSimilarity = 0.0;
        } else {
            cosineSimilarity = (double) (dotProduct / (double) (Math.sqrt(d1) * Math.sqrt(d2)));
        }
        return cosineSimilarity;
    }

    private Set<CharSequence> getIntersection(final Map<CharSequence, Integer> leftVector,
                                              final Map<CharSequence, Integer> rightVector) {
        final Set<CharSequence> intersection = new HashSet<>(leftVector.keySet());
        intersection.retainAll(rightVector.keySet());
        return intersection;
    }

    private double dot(final Map<CharSequence, Integer> leftVector, final Map<CharSequence, Integer> rightVector,
                       final Set<CharSequence> intersection) {
        long dotProduct = 0;
        for (final CharSequence key : intersection) {
            dotProduct += leftVector.get(key) * rightVector.get(key);
        }
        return dotProduct;
    }

}