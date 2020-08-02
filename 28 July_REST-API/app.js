var express = require("express");
var app = express();
app.listen(3000, () => {
 console.log("Server running on port 3000");
});

app.get("/url", (req, res, next) => {
    res.json([{"key":1,"value":"Tony"},
    {"key":2,"value":"Lisa"},
    {"key":3,"value":"Michael"},
    {"key":4,"value":"Ginger"},
    {"key":5,"value":"Food"}]);
   });

   data_rec = [{"key":1,"value":"Tony"},
   {"key":2,"value":"Lisa"},
   {"key":3,"value":"Michael"},
   {"key":4,"value":"Ginger"},
   {"key":5,"value":"Food"}];

app.post('/add', function (req, res) {
    var new_data=JSON.parse(req.body["query"]);
    data_rec.push(new_data);
   return res.json(data_rec);
});
 
app.post('/update', function (req, res) {
    new_data=JSON.parse(req.body["query"]);

    for(var i = 0; i < data_rec.length; i++)
    {
        if(data_rec[i].key == data.key)
        {
            data_rec[i].value=data.value;
            return res.json(data_rec[i]);
        }
     }
        return res.json("404")
});

app.delete('/delete/:key', function (req, res) {
    for(var i = 0; i < data_rec.length; i++)
    {
        if(data_rec[i].key == req.params.key)
        {
            data_rec.splice(i,1);
            return res.json(data_rec)
        }
        }
        return res.json("404")
    }) 
 

