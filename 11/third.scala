object third{
    def main(args : Array[String]){

        val list = List("Hello here PICT PICT is twice","Hello World")

        val words = list.flatMap(_.split(" "))

        val mappedWords = words.map(word => (word.toLowerCase,1))

        val groupData = mappedWords.groupBy(_._1)

        val result = groupData.mapValues(list => {
            list.map(_._2).sum
        })
        result.foreach(println)

    }
}