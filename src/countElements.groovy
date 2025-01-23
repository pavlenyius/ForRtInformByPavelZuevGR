def countElements(List<Integer> arr) {
  def result = [:]
  arr.each { element ->
    result[element] = (result[element] ?: 0) + 1
  }
  return result
}

// Пример использования
def arr = [1, 3, 4, 5, 1, 5, 4] // Используем список, а не массив
def result = countElements(arr)
println(result) // Вывод: [1:2, 3:1, 4:2, 5:2]