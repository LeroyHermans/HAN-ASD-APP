class Random_Number

  i = rand(10)
  puts "input a number: "
  n = gets.to_i
  x = false

    if(n == i)
      puts "you guessed the lucky number"
      x = true
    end

    if(n < i)
      puts "Try again, the number was bigger"
    end

    if(n > i)
      puts "Try again, the number was smaller"
    end

end