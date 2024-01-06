import {useState} from 'react';
import './App.css';

function useIncrement(initial, amount) {
  const [count, setCount] = useState(initial);

  const increase = () => {
    setCount(prevCount => prevCount + amount);
  };

  return [count, increase];
}

function Counter1() {
  const [count, increase] = useIncrement(0, 1);

  return (
    <div>
      <h1>Counter 1</h1>
      <p>Count: {count}</p>
      <button onClick={increase}>Add 1</button>
    </div>
  );
}

function Counter2() {
  const [count, increase] = useIncrement(0, 2);

  return (
    <div>
      <h1>Counter 2</h1>
      <p>Count: {count}</p>
      <button onClick={increase}>Add 2</button>
    </div>
  );
}

function App() {
  return (
    <div>
      <Counter1 />
      <Counter2 />
    </div>
  );
}

export default App;
