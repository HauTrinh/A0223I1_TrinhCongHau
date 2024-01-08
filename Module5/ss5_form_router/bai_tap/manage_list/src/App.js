import {useState} from 'react';
import { Formik, Field, Form, ErrorMessage } from 'formik';
import './App.css';

function App() {
  const [books, setBooks] = useState([]);
  const [form, setForm] = useState({});
  const [indexSelected, setIndexSelected] = useState(-1);

  function handleChange(event) {
    setForm({
      ...form,
      [event.target.name]: event.target.value
    });
  }

  function handleValidate() {
    let errors = {};
    if (!form.title) {
      errors.title = 'Required';
    }
    if (!form.number) {
      errors.number = 'Required';
    }
    return errors;
  }

  function handleSelect(book, index) {
    setForm(book);
    setIndexSelected(index);
  }

  function handleDelete(index) {
    let newBooks = JSON.parse(JSON.stringify(books));
    newBooks.splice(index, 1);
    setBooks(newBooks);
  }

  function handleSubmit() {
    let newBooks = JSON.parse(JSON.stringify(books));
    if (indexSelected > -1) {
      newBooks.splice(indexSelected, 1, form);
    } else {
      newBooks.push(form);
    }
    setBooks(newBooks);
    setForm({});
    setIndexSelected(-1);
  }

  return (
    <div className="container">
      <h1>Library</h1>
      <Formik
        initialValues={form}
        validate={handleValidate}
        onSubmit={handleSubmit}
      >
        {({ errors, handleSubmit }) => (
          <form onSubmit={handleSubmit}>
            <div
              className={`custom-input ${
                errors.email ? "custom-input-error" : ""
              }`}
            >
              <label>Tiêu đề</label>
              <input 
              type='text'
              name="title" 
              value={form.title || ''} 
              onChange={handleChange} 
              placeholder="Tiêu đề" />
              <p className="error">{errors.title}</p>
            </div>
            <div
              className={`custom-input ${
                errors.password ? "custom-input-error" : ""
              }`}
            >
              <label>SỐ lượng</label>
              <input 
              type='number'
              name="number" 
              value={form.number || ''} 
              onChange={handleChange} 
              placeholder="Số lượng" 
              />
              <p className="error">{errors.number}</p>
            </div>
            <button type="submit">Submit</button>
          </form>
        )}
      </Formik>  
  
      <table>
        <thead>
          <tr>
            <th>Title</th>
            <th>Number</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {books.map((book, index) => (
            <tr key={index}>
              <td>{book.title}</td>
              <td>{book.number}</td>
              <td>
                <button onClick={() => handleSelect(book, index)}>Edit</button>
                <button onClick={() => handleDelete(index)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;