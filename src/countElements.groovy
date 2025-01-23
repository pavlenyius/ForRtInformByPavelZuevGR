def countElements(List<Integer> arr) {
  def result = [:]
  arr.each { element ->
    result[element] = (result[element] ?: 0) + 1
  }
  return result
}


def arr = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(arr)
println(result)