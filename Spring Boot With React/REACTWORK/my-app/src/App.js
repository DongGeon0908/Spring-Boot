import logo from './logo.svg';
import './App.css';

// 0. React 엔진 - 데이터변경을 감지해서 UI를 그려줌
// 1. 실행과정 (index.html) -> SPA (싱글 페이지)
// 리엑트에서 페이지가 이동한다는 것은 -> BODY가 바뀐다는 것
// 2. JSX 문법 , hooks
// 3. 바벨 (자바스크립트 ES5) -> ES6 == 전환해주는 것!

var c = 10; // 변수의 scope가 꼬임

function App() {
  let a = 10; // 변수
const b = 20; // 상수
  let d = undefined; // 적용되지 않은 값

const mystyle = {
  color: "red",
};

  return (
   <div>
     
     <div style={mystyle}>안녕{ a === 10 ? "10입니다." : "10이 아닙니다."}</div>
    <h1 className="box-style">해딩테그{b === 20 && "20입니다."}</h1>
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