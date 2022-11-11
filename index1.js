const express=require('express');
const cors=require('cors');
const bodyparser=require('body-parser');
const fileupload=require('express-fileupload');
var mysql =require('mysql');

const app=express();
app.use(cors());
app.use(fileupload());
app.use(bodyparser.json());
app.use(express.json());
app.use(bodyparser.urlencoded({extended:true}));
app.use(express.static('public'));

var con=mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"password",
    database:"coding"

 
});

con.connect(function(err){
    if(err) {
        console.log(err);
    }
    else{
        console.log("connected");
    }

});

app.post('/codingregister',(req,res) =>{
    let name2=req.body.name;
    let email=req.body.email;
    let address=req.body.address;
    let phone=req.body.phone;
    let password=req.body.password;


let sql='insert into code(username,password,name,email,address,phone) values(?,?,?,?,?,?,?)';

con.query(sql,[email,password,name2,email,address,phone],(error,result)=>
{
    if(error){let s={"status":"error"};
    res.send(s);
}
    else{let s={"status":"inserted"};
    res.send(s);
}
});
});

app.post('/Codinglogin',(request,response)=>{
    let username = request.body.username;
    let password = request.body.password;

    let sql = 'select * from code where username=?';

    con.query(sql,[username],(error,result)=>{
        if(error){
            let s = {"status":"query_error"};
            response.send(s);
        }
        else if(result.length > 0){
            let username1 = result[0].username;
            let password1 = result[0].password;
            let id = result[0].id;
            let role = result[0].role;

            if(username1 === username && password1 === password){
                let s = {"status":"Success","id":id,"role":role};
                response.send(s);
            }
            else{
                let s = {"status":"Invalid_data"};
                response.send(s);
            }
        }
        else{
            let s = {"status":"error"};
            response.send(s);
        }
    })

})


app.listen(3004);

