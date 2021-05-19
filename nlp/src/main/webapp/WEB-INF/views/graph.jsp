<%@ include file="layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
<style>
    h1, h3{
        margin: 0 auto;
        text-align: center;
    }
    canvas{
        margin: 0 auto;
    }
</style>
<body>
<div id="box">
    <h1>김동건</h1>
    <h3>1번 문제</h3>
    <canvas id="first_1" width="500" height="200"></canvas>
    <h3>2번 문제</h3>
    <canvas id="first_2" width="500" height="200"></canvas>
    <h3>3번 문제</h3>
    <canvas id="first_3" width="500" height="200"></canvas>
    <h3>4번 문제</h3>
    <canvas id="first_4" width="500" height="200"></canvas>
    <h3>5번 문제</h3>
    <canvas id="first_5" width="500" height="200"></canvas>
    <h1>강동진</h1>
    <h3>1번 문제</h3>
    <canvas id="second_1" width="500" height="200"></canvas>
    <h3>2번 문제</h3>
    <canvas id="second_2" width="500" height="200"></canvas>
    <h3>3번 문제</h3>
    <canvas id="second_3" width="500" height="200"></canvas>
    <h3>4번 문제</h3>
    <canvas id="second_4" width="500" height="200"></canvas>
    <h3>5번 문제</h3>
    <canvas id="second_5" width="500" height="200"></canvas>
    <h1>황인준</h1>
    <h3>1번 문제</h3>
    <canvas id="third_1" width="500" height="200"></canvas>
    <h3>2번 문제</h3>
    <canvas id="third_2" width="500" height="200"></canvas>
    <h3>3번 문제</h3>
    <canvas id="third_3" width="500" height="200"></canvas>
    <h3>4번 문제</h3>
    <canvas id="third_4" width="500" height="200"></canvas>
    <h3>5번 문제</h3>
    <canvas id="third_5" width="500" height="200"></canvas>
    <h1>성민수</h1>
    <h3>1번 문제</h3>
    <canvas id="fourth_1" width="500" height="200"></canvas>
    <h3>2번 문제</h3>
    <canvas id="fourth_2" width="500" height="200"></canvas>
    <h3>3번 문제</h3>
    <canvas id="fourth_3" width="500" height="200"></canvas>
    <h3>4번 문제</h3>
    <canvas id="fourth_4" width="500" height="200"></canvas>
    <h3>5번 문제</h3>
    <canvas id="fourth_5" width="500" height="200"></canvas>
    <h1>한유림</h1>
    <h3>1번 문제</h3>
    <canvas id="fifth_1" width="500" height="200"></canvas>
    <h3>2번 문제</h3>
    <canvas id="fifth_2" width="500" height="200"></canvas>
    <h3>3번 문제</h3>
    <canvas id="fifth_3" width="500" height="200"></canvas>
    <h3>4번 문제</h3>
    <canvas id="fifth_4" width="500" height="200"></canvas>
    <h3>5번 문제</h3>
</div>
<canvas id="fifth_5" width="500" height="200"></canvas>
<script>
    let a = []
    let cells
    <c:forEach var="a1" items="${datas}" begin="0" end="74">
    cells = []
    <c:forEach var="a2" items="${a1}" begin="0" end="5">
    cells.push(${a2})
    </c:forEach>
    a.push(cells)
    </c:forEach>
    //*********************************     김동건     *********************************************************
    //*********************************     1번문제
    var ctx = document.getElementById('first_1');
    var first_1 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[0][0],a[1][0],a[2][0],a[3][0],a[4][0],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',

                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[25][0],a[26][0],a[27][0],a[28][0],a[29][0],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[50][0],a[51][0],a[52][0],a[53][0],a[54][0],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     2번문제     *********************************************************
    var ctx = document.getElementById('first_2');
    var first_2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[0][1],a[1][1],a[2][1],a[3][1],a[4][1],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',

                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[25][1],a[26][1],a[27][1],a[28][1],a[29][1],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[50][1],a[51][1],a[52][1],a[53][1],a[54][1],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     3번문제     *********************************************************
    var ctx = document.getElementById('first_3');
    var first_3 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[0][2],a[1][2],a[2][2],a[3][2],a[4][2],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',

                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[25][2],a[26][2],a[27][2],a[28][2],a[29][2],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[50][2],a[51][2],a[52][2],a[53][2],a[54][2],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     4번문제     *********************************************************
    var ctx = document.getElementById('first_4');
    var first_4 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[0][3],a[1][3],a[2][3],a[3][3],a[4][3],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',

                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[25][3],a[26][3],a[27][3],a[28][3],a[29][3],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[50][3],a[51][3],a[52][3],a[53][3],a[54][3],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     5번문제     *********************************************************
    var ctx = document.getElementById('first_5');
    var first_5 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[0][4],a[1][4],a[2][4],a[3][4],a[4][4],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',

                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[25][4],a[26][4],a[27][4],a[28][4],a[29][4],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[50][4],a[51][4],a[52][4],a[53][4],a[54][4],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     강동진     *********************************************************
    //*********************************     1번문제
    var ctx = document.getElementById('second_1');
    var second_1 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[5][0],a[6][0],a[7][0],a[8][0],a[9][0],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[30][0],a[31][0],a[32][0],a[33][0],a[34][0],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[55][0],a[56][0],a[57][0],a[58][0],a[59][0],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     2번문제     *********************************************************
    var ctx = document.getElementById('second_2');
    var second_2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[5][1],a[6][1],a[7][1],a[8][1],a[9][1],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[30][1],a[31][1],a[32][1],a[33][1],a[34][1],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[55][1],a[56][1],a[57][1],a[58][1],a[59][1],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     3번문제     *********************************************************
    var ctx = document.getElementById('second_3');
    var second_3 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[5][2],a[6][2],a[7][2],a[8][2],a[9][2],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[30][2],a[31][2],a[32][2],a[33][2],a[34][2],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[55][2],a[56][2],a[57][2],a[58][2],a[59][2],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     4번문제     *********************************************************
    var ctx = document.getElementById('second_4');
    var second_4 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[5][3],a[6][3],a[7][3],a[8][3],a[9][3],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[30][3],a[31][3],a[32][3],a[33][3],a[34][3],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[55][3],a[56][3],a[57][3],a[58][3],a[59][3],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     5번문제     *********************************************************
    var ctx = document.getElementById('second_5');
    var second_5 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[5][4],a[6][4],a[7][4],a[8][4],a[9][4],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[30][4],a[31][4],a[32][4],a[33][4],a[34][4],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[55][4],a[56][4],a[57][4],a[58][4],a[59][4],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     최은비     *********************************************************
    //*********************************     1번문제
    var ctx = document.getElementById('third_1');
    var third_1 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[10][0],a[11][0],a[12][0],a[13][0],a[14][0],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[35][0],a[36][0],a[37][0],a[38][0],a[39][0],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[60][0],a[61][0],a[62][0],a[63][0],a[64][0],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     2번문제
    var ctx = document.getElementById('third_2');
    var third_2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[10][1],a[11][1],a[12][1],a[13][1],a[14][1],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[35][1],a[36][1],a[37][1],a[38][1],a[39][1],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[60][1],a[61][1],a[62][1],a[63][1],a[64][1],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     3번문제
    var ctx = document.getElementById('third_3');
    var third_3 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[10][2],a[11][2],a[12][2],a[13][2],a[14][2],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[35][2],a[36][2],a[37][2],a[38][2],a[39][2],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[60][2],a[61][2],a[62][2],a[63][2],a[64][2],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     4번문제
    var ctx = document.getElementById('third_4');
    var third_4 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[10][3],a[11][3],a[12][3],a[13][3],a[14][3],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[35][3],a[36][3],a[37][3],a[38][3],a[39][3],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[60][3],a[61][3],a[62][3],a[63][3],a[64][3],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     5번문제
    var ctx = document.getElementById('third_5');
    var third_5 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[10][4],a[11][4],a[12][4],a[13][4],a[14][4],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[35][4],a[36][4],a[37][4],a[38][4],a[39][4],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[60][4],a[61][4],a[62][4],a[63][4],a[64][4],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     이진이     *********************************************************
    //*********************************     1번문제
    var ctx = document.getElementById('fourth_1');
    var fourth_1 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[15][0],a[16][0],a[17][0],a[18][0],a[19][0],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[40][0],a[41][0],a[42][0],a[43][0],a[44][0],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[65][0],a[66][0],a[67][0],a[68][0],a[69][0],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     2번문제
    var ctx = document.getElementById('fourth_2');
    var fourth_2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[15][1],a[16][1],a[17][1],a[18][1],a[19][1],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[40][1],a[41][1],a[42][1],a[43][1],a[44][1],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[65][1],a[66][1],a[67][1],a[68][1],a[69][1],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     2번문제
    var ctx = document.getElementById('fourth_2');
    var fourth_2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[15][1],a[16][1],a[17][1],a[18][1],a[19][1],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[40][1],a[41][1],a[42][1],a[43][1],a[44][1],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[65][1],a[66][1],a[67][1],a[68][1],a[69][1],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     3번문제
    var ctx = document.getElementById('fourth_3');
    var fourth_3 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[15][2],a[16][2],a[17][2],a[18][2],a[19][2],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[40][2],a[41][2],a[42][2],a[43][2],a[44][2],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[65][2],a[66][2],a[67][2],a[68][2],a[69][2],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     4번문제
    var ctx = document.getElementById('fourth_4');
    var fourth_4 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[15][3],a[16][3],a[17][3],a[18][3],a[19][3],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[40][3],a[41][3],a[42][3],a[43][3],a[44][3],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[65][3],a[66][3],a[67][3],a[68][3],a[69][3],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     5번문제
    var ctx = document.getElementById('fourth_5');
    var fourth_5 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[15][4],a[16][4],a[17][4],a[18][4],a[19][4],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[40][4],a[41][4],a[42][4],a[43][4],a[44][4],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[65][4],a[66][4],a[67][4],a[68][4],a[69][4],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     황인준     *********************************************************
    //*********************************     1번문제
    var ctx = document.getElementById('fifth_1');
    var fifth_1 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[20][0],a[21][0],a[22][0],a[23][0],a[24][0],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[45][0],a[46][0],a[47][0],a[48][0],a[49][0],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[70][0],a[71][0],a[72][0],a[73][0],a[74][0],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     2번문제
    var ctx = document.getElementById('fifth_2');
    var fifth_2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[20][1],a[21][1],a[22][1],a[23][1],a[24][1],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[45][1],a[46][1],a[47][1],a[48][1],a[49][1],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[70][1],a[71][1],a[72][1],a[73][1],a[74][1],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });//*********************************     3번문제
    var ctx = document.getElementById('fifth_3');
    var fifth_3 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[20][2],a[21][2],a[22][2],a[23][2],a[24][2],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[45][2],a[46][2],a[47][2],a[48][2],a[49][2],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[70][2],a[71][2],a[72][2],a[73][2],a[74][2],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     1번문제
    var ctx = document.getElementById('fifth_4');
    var fifth_4 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[20][3],a[21][3],a[22][3],a[23][3],a[24][3],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[45][3],a[46][3],a[47][3],a[48][3],a[49][3],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[70][3],a[71][3],a[72][3],a[73][3],a[74][3],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    //*********************************     1번문제
    var ctx = document.getElementById('fifth_5');
    var fifth_5 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['김동건', '강동진', '황인준', '성민수', '한유림'],
            datasets: [{
                label: 'Levenstein Distance',
                data: [a[20][4],a[21][4],a[22][4],a[23][4],a[24][4],],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Cosine Similarity',
                data: [a[45][4],a[46][4],a[47][4],a[48][4],a[49][4],],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            },{
                label: 'Jaccard Similarity',
                data: [a[70][4],a[71][4],a[72][4],a[73][4],a[74][4],],
                backgroundColor: [
                    'rgba(255, 206, 86, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            responsive: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
</script>
</body>
<%@ include file="layout/footer.jsp"%>