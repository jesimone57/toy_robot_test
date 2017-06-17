import java.util.List;

public class Simulator {

	public static void main(String[] args) throws Exception {

		String currentDir = System.getProperty("user.dir");
		String filename = currentDir + "/commands.txt";
		List<String> commands = Commands.inputFromFile(filename);

		Robot robot = new Robot(new SquareTableTop(5));

		for (String command : commands) {
			System.out.println("command -> " + command);

			if (command.startsWith("PLACE")) {

				String[] params = command.substring(6).split(",");
				int x = Integer.valueOf(params[0]);
				int y = Integer.valueOf(params[1]);
				Facing facing = Facing.valueOf(params[2]);

				robot.place(x, y, facing);

			} else if (command.equals("MOVE")) {

				robot.move();

			} else if (command.equals("LEFT")) {

				robot.left();

			} else if (command.equals("RIGHT")) {

				robot.right();

			} else if (command.equals("REPORT")) {

				robot.report();

			} else {
				System.out.println("Invalid command " + command + " ignored.");
			}
		}
	}
}
