def list = [1, 2, 3, 4, 5]

println list.sum() // This works fine

def calculateSum(list) {
  int sum = 0 //Explicit declaration of sum
  list.each { sum += it }
  return sum
}

println calculateSum(list) //This now works correctly