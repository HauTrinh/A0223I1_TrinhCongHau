import {useState} from 'react';
import './App.css';

//to do list
function App() {
  // const storageJobs = JSON.parse(localStorage.getItem('jobs')) // vẫn còn đang là JSON
  // // cần parse nó ra
  
  // // nếu localStorage null thì sẽ không đọc được
  // const [jobs, setJobs] = useState(storageJobs ?? []); // toán tử nullish
  let storageJobs = localStorage.getItem('jobs');
  if (storageJobs) {
    storageJobs = JSON.parse(storageJobs);
  } else {
    storageJobs = [];
  }
  const [jobs, setJobs] = useState(storageJobs);
  const[item, setItem] = useState('');

  
  const handleSubmit = () =>{
    if(item !== '') {
      setJobs(prev =>  {
        const newJobs = [...prev, item]
        
        // chuyển đổi dữ liệu qua JSON và lưu vào localStorage
        const jsonJobs = JSON.stringify(newJobs)
        localStorage.setItem('jobs', jsonJobs)

        return [...prev, item]
      })
      setItem('')
    }
  }
  const handleDelete = (index) => {
    setJobs(prev => {
      const newJobs = [...prev];
      newJobs.splice(index, 1);
      localStorage.setItem('jobs', JSON.stringify(newJobs));
      return newJobs;
    });
  }

  return (
    <div style={{textAlign:'center' }}>
        <h1>Todo List</h1>
        <input style={{textAlign:'center', fontSize: 15, padding:5 }}
            type='text'
            value={item}
            onChange={e => setItem(e.target.value)} 
          /> 
          <button style={{textAlign:'center', fontSize: 15, padding:5, margin: 5}} onClick={handleSubmit}>Add</button>
          <ul>
          {jobs.map((jobs, index) => (
            <li key={index}>
              {jobs}
              <button onClick={() => handleDelete(index)}>Delete</button>
              </li>
            
          ))}
        </ul>
    </div>  
    )
}

export default App;


// radio
// const [checked, setChecked] = useState(1)

//   const handleSubmit = () =>{
//     console.log({id: checked});
//   }

//   return (
//     <div style={{padding: 10}}>
//      {course.map(course => (
//         <div key={course.id}>
//           <input 
//             type='radio'
//             checked = {checked === course.id}
//             onChange={() => setChecked(course.id)} 
//           /> {course.name}
//         </div>
//      ))}
//      <button onClick={handleSubmit}>Register</button>
//     </div>  
//     )


//CHECKBOX
// const handleCheck = (id) => {

//   setChecked(prev =>{
//     const isChecked = checked.includes(id)
//     if (isChecked) {
//       // uncheck
//       return checked.filter( item => item !== id)
//     } else {
//       return [...prev, id]
//     }
//   })
// }

// const handleSubmit = () =>{
// console.log({id: checked});
// }

// return (
// <div style={{padding: 10}}>
//  {course.map(course => (
//     <div key={course.id}>
//       <input 
//         type='checkbox'
//         checked = {checked.includes(course.id)} // checked bây giờ là mảng. includes sẽ kt mảng có id chưa
//         onChange={() => handleCheck(course.id)} 
//       /> {course.name}
//     </div>
//  ))}
//  <button onClick={handleSubmit}>Register</button>
// </div> 
// ) 


