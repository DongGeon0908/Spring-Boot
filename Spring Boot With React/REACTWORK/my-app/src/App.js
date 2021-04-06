import { cleanup } from '@testing-library/react' 
import { useEffect, useState } from 'react' // {}는 해당 파일에 메인 오브젝트가 아닌 다른것을 임포트한다는 의미 -> export default로 가져오는게 아니라는 의미
import './App.css' 

// map, filter, concat, spread, slice
function App(){

  const[data, setData] = useState(0);
  const[search, setsearch] = useState(0);

  const download = () => {
    // 다운로드 받고 통신
    let downloadData = 5; // 가정
    setData(downloadData);
  }

// 실행시점: 
// 1. App() 그림이 최초 그려질 때
// 2. 상태 변수가 변경될 때 (dependencyList에 등록되어 있어야함!)
// 3. 의존리스트 관리 가능
useEffect(()=>{
  console.log("useEffect 실행");
  download();
}, [search]);

return (
<div>
  <button onClick={()=>{
    setsearch(2);
  }}>검색하기</button>
  <h1>Hello Word : {data}</h1>
  <button onClick={()=>{
    setData(data+1);
  }}>더하기
</button>
</div>
);
}

// 해당 함수를 외부로 노출
export default App;