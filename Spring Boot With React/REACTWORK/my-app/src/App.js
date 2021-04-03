import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Sub from './Sub';

// 0. React 엔진 - 데이터변경을 감지해서 UI를 그려줌
// 1. 실행과정 (index.html) -> SPA (싱글 페이지)
// 리엑트에서 페이지가 이동한다는 것은 -> BODY가 바뀐다는 것
// 2. JSX 문법 , hooks
// 3. 바벨 (자바스크립트 ES5) -> ES6 == 전환해주는 것!

var c = 10; // 변수의 scope가 꼬임

function App() {
 
  // 다운로드 받음
  const[users, setUsers] = useState([{id:5, name:"덮어씌우기"}]);

  const download =() => {
    let sample = [
      {id:1, name:"김동건"},
      {id:2, name:"김건"},
      {id:3, name:"동건"},
      {id:4, name:"건"},
    ];
    setUsers([...sample]);
  }

  //const [users, setUsers] = useState(sample); // 레퍼런스가 변경되야 동작

  const download = () => {
    const a = sample.concat({id:5, name: "조자룡"});
    setUsers(a);
  };

  // 랜더링 시점 = 상태값 변경
  return (
    <div>
      <button onClick={download}>다운로드</button>
      {users.map((u)=>(
        <h1>
          {u.id}, {u.name}
        </h1>
      ))}
    </div>
  );
}

export default App;

// 1. return 시에 하나의 Dom만 리턴 가능
// --> 리엑트는 하나의 태그만 return
// --> return 할때 여러 줄이면 가로 필요
// 2. 변수 선언은 let 혹은 const로만 선언
// 3. if사용 불가능 -> 삼항 연산자 사용 가능 (조건 ? 값(true) : 값(false))
// == 는 값을 비교 === 타입까지 비교
// 4. 조건부 렌더링 -> 삼항 연산자에서 false 기능이 빠진거라고 생각
// (조건 && 값(true))
// 5. css 디자인
// - 내부에 적는 방법
// - 외부 파일에 적는 방법
// - 라이브러리 사용 (부트스트랩, component - styled)