
// useMemo => 메모라이제이션(기억)
// React Hooks

import { useMemo, useState } from "react";

function App(){

  const[list, setList] = useState([1,2,3,4]);
  const[str, setStr] = useState("합계");
  


  const getAddResult = () =>{
    //1 초
    let sum = 0;
    list.forEach((i) => (sum = sum + i));
    console.log('sum', sum);
    return sum;
  }
  const addResult = useMemo(()=>getAddResult(),[list]);

return <div>
 <button onClick={()=>{setStr("안녕");
  }}> 리스트값 추가
  </button>

  <button onClick={()=>{setList([...list, 10]);
  }}> 리스트값 추가
  </button>
  <div>
  {list.map((i) => (
    <h1>{i}</h1>
  ))}
  </div>
  <div>{str} : {addResult}</div>
</div>

}

export default App;