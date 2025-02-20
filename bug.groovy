def list = [1, 2, 3, 4, 5]

println list.sum() // This works fine

def calculateSum(list) {
  list.each { sum += it }
  return sum
}

println calculateSum(list) // This will throw a MissingPropertyException