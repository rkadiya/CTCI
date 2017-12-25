package trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class BuildOrder {

	public static void main(String[] args) {
		List<Integer> projects = new ArrayList<>();
		projects.add(1);
		projects.add(2);
		projects.add(3);
		projects.add(4);
		projects.add(5);
		projects.add(6);
		
		Multimap<Integer, Integer> dep = ArrayListMultimap.create();
		dep.put(1, 4);
		dep.put(6, 2);
		dep.put(2, 4);
		dep.put(6, 1);
		dep.put(4, 3);
		
		//Output: f, e, a, b, d, c
		
		List<Integer> ind = new ArrayList<>(projects);
		ind.removeAll(dep.values());
		System.out.println("Ind is " + ind);
		
		Map<Integer, Node> deps = Maps.newHashMap(); 
				
		for (Map.Entry<Integer, Integer> entry : dep.entries()) {
			Node pnode = deps.get(entry.getKey());
			if (pnode == null) {
				pnode = new Node(entry.getKey());
				deps.put(entry.getKey(), pnode);
			}
			
			Node cnode = deps.get(entry.getValue());
			if (cnode == null) {
				cnode = new Node(entry.getValue());
				deps.put(entry.getValue(), cnode);
			}
			
			pnode.addChild(cnode);
		}
		
		for (Integer i : ind) {
			//Node n = new Node(i);
			
			Node nodeFromDeps = deps.get(i);
			if (nodeFromDeps != null) {
				bfs(nodeFromDeps);
			} else {
				System.out.println(i);
			}
		}
		
	}
	
	public static void bfs(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node u = q.poll();
			if (u != null) {
				System.out.println(u.value);
				u.state = State.visited;
				for (Node v : u.children) {
					if (v.state == State.unvisited && !q.contains(v)) {
						q.add(v);
					}
				}
			}
		}
	}

}
