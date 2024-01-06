import {useState} from 'react';
import './App.css';

const carList = ['Mercedes S600', 'BMW M3', 'Audi A8'];
const colorList = ['Black', 'White', 'Red'];

function App() {
  const [selectedCar, setSelectedCar] = useState({
    car: carList[0],
    color: colorList[0]
  })

  const handleCarChange = (event) => {
    setSelectedCar(prevState => ({
      ...prevState,
      car: event.target.value
    }));
  };

  const handleColorChange = (event) => {
    setSelectedCar(prevState => ({
      ...prevState,
      color: event.target.value
    }));
  };


  return (
    <div style={{padding: 20, margin: 20, fontSize:20}}>
      <h1>Select your car</h1>
      <label style={{padding: 20, margin: 20}}>
        Select a car: 
        <select 
          style={{padding: 5, margin: 5}}
          value={selectedCar.car}
          onChange={handleCarChange}
          >
        {carList.map((car, index) => (
            <option key={index} value={car}>
              {car}
            </option>
          ))}
        </select>
      </label>
       <br/>
       <br/>
      <label style={{padding: 5}}>
        Select a color: 
        <select 
          style={{padding: 5, margin: 5}}
          value={selectedCar.color}
          onChange={handleColorChange}
          > 
        {colorList.map((color, index) => (
            <option key={index} value={color}>
              {color}
            </option>
          ))}
        </select>
      </label>
      <h3>You selected a {selectedCar.color} - {selectedCar.car} </h3>
    </div>
  );
}

export default App;

// Timer
// const [timer, setTimer] = useState(10);

// useEffect(() => {
//   const countdown = setInterval(() => {
//     setTimer((prevTimer) => prevTimer > 0 ? prevTimer - 1 : 0);
//   }, 1000);

//   // Clean up effect
//   return () => {
//     clearInterval(countdown);
//   };
// }, []);

// return (
//   <div>
//     <h1>Countdown: {timer}</h1>
//   </div>
// );