package com.kodilla.hibernate.manytomany.dao;

//
//@SpringBootTest
//class CompanyDaoTestSuite {
//
//    @Autowired
//    private CompanyDao companyDao;
//    @Autowired
//    private EmployeeDao employeeDao;
//
//    @Test
//    void testSaveManyToMany() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //Then
//        assertNotEquals(0, softwareMachineId);
//        assertNotEquals(0, dataMaestersId);
//        assertNotEquals(0, greyMatterId);
//
//        //CleanUp
//
//           companyDao.deleteById(softwareMachineId);
//           companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//            employeeDao.deleteById(johnSmith.getId());
//            employeeDao.deleteById(stephanieClarckson.getId());
//            employeeDao.deleteById(lindaKovalsky.getId());
//    }
//    @Test
//    public void testNamedQueries(){
//
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaSmith = new Employee("Linda", "Smith");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company softDataMasters = new Company("Soft Data Masters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        softDataMasters.getEmployees().add(stephanieClarckson);
//        softDataMasters.getEmployees().add(lindaSmith);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaSmith);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(softDataMasters);
//        lindaSmith.getCompanies().add(softDataMasters);
//        lindaSmith.getCompanies().add(greyMatter);
//
//        companyDao.save(softwareMachine);
//        companyDao.save(softDataMasters);
//        companyDao.save(greyMatter);
//        //When
//        List<Employee> lastName = employeeDao.retrieveEmployeeWithLastname("Smith");
//        List<Company> nameStartedWith = companyDao.retrieveCompanyNameLike("Sof");
//
//        //Then
//        Assertions.assertEquals(34, lastName.size());
//        Assertions.assertEquals(34, nameStartedWith.size());
//
//        //cleanuup
//
//
//    }
//}
//