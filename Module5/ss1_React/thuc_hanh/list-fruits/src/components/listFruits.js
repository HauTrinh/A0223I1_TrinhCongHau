import {Component} from "react";

const listFruits =  ['Apple', 'Banana', 'Orange', 'Apricot', "Black rowan", "Cranberry"];

class ListFruits extends Component {
 render(){
    return (
        <div>
    <h1>List of fruits</h1>
    <ul>
      { listFruits.map((item) => (
        <li>{ item }</li>
      )) }
    </ul>
 </div>
    );
 }
}
export default ListFruits;