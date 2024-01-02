import React, { Component } from 'react';
class ChangeColor extends Component {
    constructor(props) {
      super(props);
      this.state = {
        color: 'black'
      };
    }
  
    // componentDidMount() {
    //   setTimeout(() => {
    //     this.setState({ color: 'pink' });
    //   }, 5000);
    // }
  
    changeColor = () => {
        this.setState({ color: 'pink' });
      }
    
    render() {
      return (
        <div  style={{ textAlign: "center", padding: 10, fontSize: 30}}>
          <div
            style={{
              backgroundColor: this.state.color,
              paddingTop: 20,
              width: 400,
              height: 80,
              margin: 'auto'
            }}
          />
           <button style={{ fontSize: 30}} onClick={this.changeColor}>Change color</button>
        </div>
      );
    }
  }
  
  export default ChangeColor;