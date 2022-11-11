import { Link} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css'
import axios from 'axios';


export default function Codingregister(){

    const handlesubmit = async(event) => {
        event.preventDefault();

        var datastring=new FormData(event.target);
        var config={headers:{"enctype":"multipart/form-data"}};

       
        let name1 = document.getElementById('name').value;
        let email = document.getElementById('email').value;
        let phone = document.getElementById('phone').value;
        let address = document.getElementById('address').value;
        let password = document.getElementById('password').value;

       
        if(name1 === '' || name1 === null){
            alert('enter name');
        }
        else if(email === '' || email === null){
            alert('enter email');
        }
        else if(phone === '' || phone === null){
            alert('enter phone');
        }
        else if(address === '' || address === null){
            alert('enter address');
        }
        else if(password === '' || password === null){
            alert('enter password');
        }
        else{
            await axios.post('http://localhost:3004/Codingregister',datastring,config)
            .then(function(res){
              if(res.data.status === 'error'){
                  alert('Error');
                  window.location.reload();
              }
              else if(res.data.status === 'inserted'){
                  alert('Profile Created');
                  window.location.href="./";
              }
            })
            .catch(function(err){
              alert(err);
              window.location.reload();
            })
        }


    }




    return(
        <>
           <div className="container">
           <div className="row">
            <div className="col-lg-3"></div>
            <div className="col-lg-6">
                <form onSubmit={handlesubmit}>
                <div className="table-responsive">
                    <table className="table table-bordered">
                        <thead>
                            <tr>
                                <th colspan={2}>Sign-up</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Name</td>
                                <td>
                                    <input type="text" name="name" id="name" className="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td>
                                    <input type="email" name="email" id="email" className="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td>
                                    <input type="text" name="address" id="address" className="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Phone</td>
                                <td>
                                    <input type="number" name="phone" id="phone" className="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td>
                                    <input type="password" name="password" id="password" className="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <Link to='/'>
                                        <button type="button" name="data_send" id="data_send" className="btn1">SignIn</button></Link>
                                </td>

                                <td>
                                    
                                       <button type="submit" name="data_submit" id="data_submit" className="btn2">Register</button>
                                </td>
                            </tr>
                            
                        </tbody>
                    </table>
                </div>
                </form>
            </div>
            <div className="col-lg-3"></div>
           </div>
           </div>



        </>
    )
}