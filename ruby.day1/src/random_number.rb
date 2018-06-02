class Random_Number

  i = rand(10)
  x = false

  until x
    puts "input a number: "
    n = gets.to_i

    if n == i
      puts "you guessed the lucky number"
      x = true
      word_index.returnsHello
    end

    if n < i
      puts "Try again, the number was bigger"
    end

    if n > i
      puts "Try again, the number was smaller"
    end
  end
end