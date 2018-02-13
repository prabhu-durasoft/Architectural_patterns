class CreatePalindromes < ActiveRecord::Migration
  def change
    create_table :palindromes do |t|
      t.string :word

      t.timestamps null: false
    end
  end
end
