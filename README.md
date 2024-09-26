# Vendo Tests

## Project Overview

This project involves creating and executing automated tests for the web application [Vendoo](https://vendoo.ge) using Selenide. The tests include validating various functionalities and ensuring the robustness of the web application. The project emphasizes using Page Object Model, Fluent Interface patterns, and generating comprehensive Allure reports.

## Table of Contents
1. [Installation](#installation)
2. [Project Structure](#project-structure)
3. [Test Cases](#test-cases)
   - [UI / Visual Tests](#ui--visual-tests)
   - [Functional Tests](#functional-tests)
   - [Filter Tests](#filter-tests)
4. [TestNG Configuration](#testng-configuration)
5. [Conflict Resolution](#conflict-resolution)
6. [Project Development Requirements](#project-development-requirements)
## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-repo/vendo-tests.git
    cd vendo-tests
    ```

2. Create and switch to the development branch:
    ```sh
    git checkout -b project_dev
    ```

3. Set up your environment:
    - Ensure you have Java JDK 8 or higher installed.
    - Install Maven.

4. Install project dependencies:
    ```sh
    mvn clean install
    ```

## Test Cases

### UI / Visual Tests

1. **Validate that Vendoo Button exists at the top.**
   - XPath: `//img[@alt='Vendoo Logo']`

2. **Validate that Searchbar has placeholder "ძიება ვენდუზე".**

3. **Validate that upon clicking on the search bar, search suggestions show up.**
   - XPath: `//div[@class='relative']`

4. **Write something in Search Bar and validate if suggestions match or include those words in search.**
   - XPath: `//div[@class='relative']//a/p`

5. **Validate if Header text contains - ყოველთვის უკეთესი შეთავაზება.**
   - XPath: `//span[@color='light']`

### Functional Tests

1. **Validate if Promotion button takes us to the Promotion Page.**
   - XPath: `//img[@alt='Vendoo Promotions']`

2. **Validate if Cart takes us to the cart page.**
   - XPath: `//img[@alt='Vendoo Card']`

3. **Validate if Auth button takes us to the authentication page.**
   - XPath: `//img[@alt='Auth']`

4. **Upon clicking Tnet button, all Tnet websites page should show up.**
   - XPath: `//div[@id='headlessui-menu-items-:r3r:']`
   - Validate if it has text Tnet: `//div[@id='headlessui-menu-items-:r3r:']/h2`
   - Validate if Description is Correct: `//div[@id='headlessui-menu-items-:r3r:']/p`

5. **Type "Xiaomi Redmi Note 13" in search bar and click on first item suggestion, validate if took to the correct place.**

6. **Search "Xiaomi" and validate if all items on first page contain the word "Xiaomi".**
   - XPath: `//div[@class='mt-1 line-clamp-2 min-h-9 font-tbcx-medium text-sm']`

### Filter Tests

1. **From Main page, hover over "ტექნიკა" and go to mobile devices.**
   - XPath: `//img[@alt='ტექნიკა'] > ??`

2. **Tick Discount tab and validate if every item has a Discount symbol.**
   - Item XPath: `//div[@class='group relative min-h-[298px] w-[160px] overflow-y-hidden w-full cursor-pointer overflow-visible desktop:h-[315px] desktop:w-[190px]']`
   - Discount XPath: `//div[@class='group relative min-h-[298px] w-[160px] overflow-y-hidden w-full cursor-pointer overflow-visible desktop:h-[315px] desktop:w-[190px]']//span[@class='bg-[#F93A3A] text-white hidden desktop:block font-tbcx-bold py-[2px] px-[5px] text-sm rounded-lg']`

3. **Tick 0-100 Gel Price range and validate if items are within the range.**
   - XPath: `//span[@class='text-nowrap font-tbcx-bold text-sm desktop:text-2sm']`

4. **Tick Honor devices and validate if all devices contain Honor in their name.**

5. **Tick Black color option and validate if all devices contain Black in their name.**

6. **Tick 64GB and validate if all devices are in fact 64GB.**

7. **Select Price in ascending order, validate if all devices are in order on first page.**
