package com.te.learnjava8.advance.java8features.streamapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnStreamApi {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("TY0001", "Name01", 22, LocalDate.of(2019, 9, 1), 21000));
		employees.add(new Employee("TY0004", "Name04", 21, LocalDate.of(2017, 6, 1), 25000));
		employees.add(new Employee("TY0009", "Name09", 27, LocalDate.of(2022, 3, 1), 23000));
		employees.add(new Employee("TY0002", "Name02", 25, LocalDate.of(2021, 8, 1), 28000));
		employees.add(new Employee("TY0005", "Name05", 20, LocalDate.of(2020, 1, 1), 27000));

		/*
		 * 1: Increase the salary of employees by 50% who have spent 2+ years in the
		 * company. And for employees less than 2 years, increase the salary by 20%.
		 */

		for (Employee employee : employees) {
			if (LocalDate.now().getYear() - employee.getEmpDataOfJoining().getYear() >= 2) {
				employee.setEmpSalary(employee.getEmpSalary() * 1.5);
			} else {
				employee.setEmpSalary(employee.getEmpSalary() * 1.2);
			}
		}

		/*
		 * employees.stream() method returns you an object of Stream<Employee> type data
		 * structure!
		 */
		// Stream<Employee> stream = employees.stream();
		// Consumer<Employee> consumer_ = e -> System.out.println(e);
		// employees.stream().forEach(consumer_);

		Consumer<Employee> increaseSalary = employee -> {
			if (LocalDate.now().getYear() - employee.getEmpDataOfJoining().getYear() >= 2) {
				employee.setEmpSalary(employee.getEmpSalary() * 1.5);
			} else {
				employee.setEmpSalary(employee.getEmpSalary() * 1.2);
			}
		};

		employees.stream().forEach(increaseSalary);

		employees.stream().forEach(e -> System.out.println(e));

		// 2: Filter employees whose age is less than 25!
		Predicate<Employee> checkAge = e -> e.getEmpAge() < 25;

		employees.stream().filter(e -> e.getEmpAge() < 25).collect(Collectors.toSet()).stream()
				.forEach(e -> System.out.println(e));

		// 3: Convert Employee objets to Manager if the salary is more than 30000!
		Function<Employee, Manager> function = e -> {
			if (e.getEmpSalary() >= 50000) {
				Manager manager = new Manager();
				manager.setmId(e.getEmpId());
				manager.setmAge(e.getEmpAge());
				manager.setmDataOfJoining(e.getEmpDataOfJoining());
				manager.setmName(e.getEmpName());
				manager.setmSalary(e.getEmpSalary());
				return manager;
			}
			return null;
		};
		employees.stream().map(function).collect(Collectors.toSet()).stream().forEach(m -> System.out.println(m));
	}
}
