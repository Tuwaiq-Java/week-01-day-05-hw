# واجب اليوم الخامس


## السؤال الاول:

1-Create an interface **PayAble** which contains the following method:
+computeAmount(): Double

2-Create an Abstract class “**Employee**” that has the following two properties:
-id
-name

3-Create a child class “**FullTimeEmployee**” that extends **Employee** and has the property:
-int weeklySalary
the class **FullTimeEmployee** computes the amount as follows:
4*weeklySalary

4-Create a child class “**PartTimeEmployee**” that extends **Employee** and has the properties:
-int workHours
-int wage
the class **PartTimeEmployee** computes the amount as follows:
workHours * wage

5-Create class “**Company**” that has a list of “**PayAble**” objects and contains a method to count the total amount of all Employee salaries and then prints it on the screen
in addition to that, it has toString() method to print each employee details

6-Create a class to test your code “**Main method**” in the Main method, add some **FullTimeEmployee** and **PartTimeEmployee** objects to the list and then compute the total amount of salaries

<img width="616" alt="image" src="https://user-images.githubusercontent.com/58336325/169295852-7b71915f-c705-4a47-a606-a6b083251b4a.png">

Main : 

``
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee(1,"Saleh",100);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee(2,"Ali",50);

        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee(1,"Khalid",8,100);
        PartTimeEmployee partTimeEmployee2=new PartTimeEmployee(2,"Noura",5,3);

        Company company=new Company("Tuwaiq");

        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);

        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);

        System.out.println(company);
        System.out.println(company.computeAmount());
``        

Output : 

`` 
Company{payables=[Employee{id=1, name='Saleh'}, Employee{id=2, name='Ali'}, Employee{id=1, name='Khalid'}, Employee{id=2, name='Noura'}], name='Tuwaiq'}
1415.0
``



