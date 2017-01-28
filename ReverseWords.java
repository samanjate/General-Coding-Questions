// Reverses the individual words in a given sentance

// e.g The sky is blue
// output :-  ehT yks si eulb


public class ReverseWords {

	String reverseWords (String input_str) {
		char[] arr = input_str.toCharArray();
		String reversed = new String("");
		for (int i = arr.length - 1 ; i >= 0 ; i--){
			reversed += arr[i];
		}
		return reversed;
	}

	public static void main(String[] args) {

		ReverseWords p = new ReverseWords();

		String str = new String("The sky is blue");
		String[] str_arr = str.split(" ");
		int count = 0;

		for (String s : str_arr) {
			str_arr[count] = p.reverseWords(s);
			count++;
		}

		String answer = new String("");
		for (String s : str_arr) {
			answer += s + " ";
		}

		System.out.println(answer.trim());
	}
}