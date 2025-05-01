Feature: Navigation bar
 To see the subpages
 Without logging in
 I can click the navigation bar links
 
#     Given I navigate to www.freerangetesters.com
    #     When I go to <section> using the navigation bar
    #     Examples:
    #         | section    |
    #         | Cursos     |
    #         | Recursos   |
    #         | Udemy      |
    #         | Mentorías  |
    #         | Newsletter |


@Test
Scenario: Courses are presented correctly to potential customers
    Given I navigate to www.freerangetesters.com
    When I go to Cursos using the navigation bar


