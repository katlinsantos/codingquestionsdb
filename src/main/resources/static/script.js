
function getQuestion() {

    if (document.getElementById("get-question").innerHTML == "close") {
        document.getElementById("response-container").style.display = "none"
        document.getElementById("get-question").innerHTML = "try first"
        document.getElementById("response-container").innerHTML = " "
    }
    else  {
        $.getJSON("http://codingquestionsdb.com/questions/sample",
                    function(data, status){
               document.getElementById("response-container").innerHTML = "<pre>" + "<br>" + "&nbsp" + "{<br>" +
                "     title: " + data.title  + "<br>" + 
                "     task: " + data.task + "<br>" +
                "     input: " + data.input + "<br>" +
                "     exampleInput: " + data.exampleInput + "<br>" +
                "     output: " + data.output + "<br>"+
                "     exampleOutput: " + data.exampleOutput + "<br>" + 
                "     note: " + data.note + "<br>" +
                "     category: " + data.category + "<br>" + "&nbsp" + "}" + "<br>" + "<br>" + "</pre>"; 
          });
        document.getElementById("response-container").style.display = "block"
        document.getElementById("get-question").innerHTML = "close"
    }
}
