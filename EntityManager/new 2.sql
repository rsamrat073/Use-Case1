create keypspace entitymanager with replication = {'class':'NetworkTopologyStrategy','dc1': 2 };

create table Product
(id int,productName varchar,
productDescription varchar,productPrice int,
productModelNumber varchar, primary key(id,productName,productPrice));

create table Patient
(id int,patientName varchar,
currentDisease varchar,previousDisease varchar,
weight int,age int,primary key(id,patientName,currentDisease));


create table Employee
(id int,empName varchar,
empCode varchar,empSalary int,technologyStack varchar,primary key(id,empName,technologyStack));


{
    "id": 1,
    "productName": "Seute Bag",
    "productDescription": "Backpack bag",
    "productPrice": 2100,
    "productModelNumber": "Seuete 123"
}

{
    "id": 1,
    "patientName": "Samrat Roy",
    "currentDisease": "Very Sick",
    "previousDisease": "Sick",
    "weight": 75,
	"age": 26
}

{
    "id": 1,
    "empName": "Samrat Roy",
    "empCode": "135569",
    "empSalary": 1500000,
    "technologyStack": Core Java-Web
	
}
