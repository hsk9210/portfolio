import React, { Component } from 'react';

​

function GetPrice(cart) {

  return cart.price * cart.count;

}

​

const cart = {

  name : 'goods',

  price : 11000,

  count : 5

};

​

class CalcTable extends Component {

  render() {

    return (

        <table>

          <thead>

            <tr>

               <th>상품</th>

               <th>수량</th>

               <th>가격</th>

            </tr>

         </thead>

         <tbody>

            <tr>

               <td>{cart.name}</td>

               <td>{cart.count}</td>

               <td>{cart.price}</td>

            </tr>

            <tr>

               <td colSpan="2">총 가격 </td>

               <td>{GetPrice(cart)}</td>

            </tr>

           </tbody>

       </table>

   );

  }

}

​

class Cart extends Component {

   render() {

        return (

           <div className="Cart">

              <CalcTable></CalcTable>

           </div>

         );

    }

}

​

export default Cart;