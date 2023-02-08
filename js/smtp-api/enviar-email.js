function sendEmail() {
  console.log("Send email");
  /*Email.send({
    Host: "smtp.elasticemail.com",
    Username: "Sergh",
    Password: "A9E41FB71E71AF2E32ED7E5CBF7A440DE933",
    To: "sergio.torres@idr.edu.mx",
    From: "sergio.torres@idr.edu.mx",
    Subject: "This is the subject",
    Body: "And this is the body",
  }).then((message) => alert(message));*/

  Email.send({
    Host: "smtp.elasticemail.com",
    Username: "sergio.torres@idr.edu.mx",
    
    To: "sergio.torres@generation.org",
    From: "sergio.torres@idr.edu.mx",
    Subject: "This is the subject",
    Body: "And this is the body",
  }).then((message) => alert(message));
}
