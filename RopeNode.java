public class RopeNode
	{
		RopeNode left, right;
		String data;
		int weight;

		RopeNode(String data)
		{
			this.data = data;
			left = right = null;
			this.weight = data.length();
		}

		public RopeNode() {
			this.data = null;
			this.left = this.right = null;
			this.weight = 0;
		}
	}
