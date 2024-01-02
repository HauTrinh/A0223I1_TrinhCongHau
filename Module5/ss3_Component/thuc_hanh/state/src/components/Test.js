import { Component } from "react";
class Test extends Component {

    constructor(props) {
        super(props);
          
        this.state = {
           header: "Header from state...",
           content: "Content from state...",
            status: true
        }
     };

     updateContent = () => {
      this.setState({content: "newContent"});
   }
      submit = () => {
         this.setState({status: !this.state.status});
      }

     render() {
        return (
           <div>
              <h1>{this.state.header}</h1>
              <h2>{this.state.content}</h2>
              <h2>{this.state.status.toString()}</h2>

               <button onClick={this.updateContent} >Update Content</button>
               <button onClick={this.submit} >Submit</button>
           </div>
        );
     }
}
export default Test;