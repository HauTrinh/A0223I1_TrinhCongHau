import { Component } from 'react';

class ToDoList extends Component {
  constructor(props) {
    super(props);
    this.state = {
      list: [], // mảng chứa các phần tử thêm vào
      item: ''  // input được nhập
    };
  }

  handleChange = (event) => {
    this.setState({ item: event.target.value });
  }

  handleAddItem = () => {
    if (this.state.item !== '') {
      this.setState(prevState => ({
        list: [...prevState.list, prevState.item],
        item: ''
      }));
    }
  }

  render() {
    return (
      <div style={{textAlign:'center', padding: 30 }}>
        <h1>Todo List</h1>
        <input style={{textAlign:'center', fontSize: 15,padding: 10 }}
          type="text" 
          value={this.state.item} 
          onChange={this.handleChange} 
        />
        <button style={{textAlign:'center', fontSize: 15,padding: 10 }} onClick={this.handleAddItem}>Add</button>
        <ul>
          {this.state.list.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default ToDoList;
