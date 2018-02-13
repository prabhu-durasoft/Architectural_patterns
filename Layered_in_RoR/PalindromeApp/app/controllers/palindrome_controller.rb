class PalindromeController < ApplicationController
  def index
    
  end
  def check
    word = params['word']
    palindrome = Palindrome.new(word: word)
    result = palindrome.check
    palindrome.save
    render :json => result
  end
end
