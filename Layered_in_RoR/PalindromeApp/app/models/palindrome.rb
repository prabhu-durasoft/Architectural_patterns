class Palindrome < ActiveRecord::Base
  #belongs_to :user
  def check
    word == word.reverse
  end
  
end
