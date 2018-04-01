# Commenting out the authors website & using Google instead
require 'rubygems'
require 'selenium-webdriver'

selenium = Selenium::WebDriver.for(:firefox)

# selenium.get("http://awful-valentine.com/")
# selenium.find_element(:id, "searchinput").clear
# selenium.find_element(:id, "searchinput").send_keys("cheese")
# selenium.find_element(:id, "searchsubmit").click

selenium.get("http://www.google.com")
selenium.find_element(:name, "q").clear
# selenium.find_element(:name, "q").send_keys("Test automation jobs, San Jose, CA")

selenium.find_element(:name, "q").send_keys("Selenium Ruby binding code samples")
selenium.find_element(:name, "btnK").click

sleep(120)
selenium.quit
