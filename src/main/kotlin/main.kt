fun main() {

    var supplies = arrayOf("Hot dogs", "Buns", "Ketchup", "Mustard" , "Relish")
    var qty = arrayOf("50", "50", "5", "4", "3")

    var inventory = arrayOf<Array<String>>()
    inventory += supplies
    inventory += qty
    do {
        println("(1) Search an item\n(2) Change inventory\n(3) Quit")
        print("Chose a number: ")
        var choice = readln()!!.toInt()
        if (choice == 1) {
            print("Enter an item number: ")
            var choice = readln()!!.toInt()
            if (choice <= supplies.size - 1)
            println("Item - ${supplies[choice]} | Quantity - ${qty[choice]}")
        }
        else if (choice == 2) {
            print("Enter an item number: ")
            var choice = readln()!!.toInt()
            println(supplies[choice] + " - Quantity: ${qty[choice]}")
            print("Change amount by: ")
            var change = readln()!!.toInt()
            var tempChange: Int = qty[choice].toInt()
            tempChange += change
            if (tempChange < 0) {
                println("Error: Sum less than zero")
                qty[choice] = "0"
            }
            else
                qty[choice] = tempChange.toString()
            println("The item [${supplies[choice]}]'s quantity is now: ${qty[choice]}")

        }
        else if (choice == 3) {
            println("Goodbye")
        }
        else
            println("Enter a valid number")
    } while (choice != 3)
}