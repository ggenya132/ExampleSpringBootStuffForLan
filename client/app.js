const patientElement = document.querySelector(".patients");

const fetchPatients = () => {
  fetch("http://localhost:8080/patient/")
    .then((res) => res.json())
    .then((patients) => {
      patients.forEach((patient) => {
        patientElement.innerHTML += `<h1>Patient Name: ${patient.name}</h1>`;
      });
    })
    .catch(console.error);
};

fetchPatients();
