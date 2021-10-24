/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intheritanceorm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class IntheritanceORM {

    public static void main(String[] args) {
        FulltimeEmployee emp_1 = new FulltimeEmployee();
        ParttimeEmployee emp_2 = new ParttimeEmployee();
        
        EmployeeTable.insertEmployee(emp_1);
        emp_1.setName("Sorraaut");
        emp_1.setSalary(35000);

        emp_2.setName("LnwZa");
        emp_2.setHoursWork(6);
        
        EmployeeTable.updateFullTimeEmployee(emp_1);
        emp_1.setName("Sorraaut2");
        emp_1.setSalary(15000);
        
        EmployeeTable.updatePartTimeEmployee(emp_2);
        emp_2.setName("LnwZa007");
        emp_2.setHoursWork(24);
        
        EmployeeTable.removeFullTimeEmployee(emp_1);
        EmployeeTable.removePartTimeEmployee(emp_2);
    }
    
}
