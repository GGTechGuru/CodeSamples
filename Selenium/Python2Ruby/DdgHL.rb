=begin
  Comments begin

  PYTHON CODE (NOT MINE) USED AS ALGORITHM / PSEUDOCODE for Ruby code.
  
  Used from:  https://realpython.com/modern-web-automation-with-python-and-selenium/

>>> from selenium.webdriver import Firefox
>>> from selenium.webdriver.firefox.options import Options
>>> opts = Options()
>>> opts.set_headless()
>>> assert opts.headless  # operating in headless mode
>>> browser = Firefox(options=opts)
>>> browser.get('https://duckduckgo.com')
>>> search_form = browser.find_element_by_id('search_form_input_homepage')
>>> search_form.send_keys('real python')
>>> search_form.submit()
>>> results = browser.find_elements_by_class_name('result')
>>> print(results[0].text)

  Comments end
=end


require 'selenium-webdriver'

opts = Selenium::WebDriver::Firefox::Options.new
opts.add_argument('--headless')
# wbdrv = Selenium::WebDriver.for :firefox, options: opts
wbdrv = Selenium::WebDriver.for :firefox

wbdrv.navigate.to 'https://duckduckgo.com'

elem = wbdrv.find_element(id: 'search_form_input_homepage')
elem.send_keys('test automation jobs near san jose, ca')
elem.submit

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
res = wait.until {
	elements = wbdrv.find_elements(class: 'result')
	elements if elements.size > 0
}

res.each do |res_row|
	puts res_row.text
end

wbdrv.save_screenshot 'duckduckgo_rails_automation.png'

wbdrv.quit
