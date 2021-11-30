package Logica;

import java.util.ArrayList;
import java.util.Comparator;

public class BinaryTree <T> {
    private TreeNode<T> root;
    private Comparator<T> comparator;
    ArrayList<T> out;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addNode(T info) {
        TreeNode<T> node = new TreeNode<>(info);
        if (isEmpty()) {
            root = node;
        } else {
            TreeNode<T> aux = root;
            TreeNode<T> ant = null;
            while (aux != null) {
                ant = aux;
                aux = comparator.compare(info, aux.getInfo()) < 0 ? aux.getLeft() : aux.getRight();
              /*  if(comparator.compare(info, aux.getInfo())<0) {
                    aux = aux.getLeft();
                }else{
                    aux=aux.getRight();
                }*/
            }
            if (comparator.compare(info, ant.getInfo()) < 0) {
                ant.setLeft(node);
            } else {
                ant.setRight(node);
            }
        }
    }

    public ArrayList<T> listPresort() {
        out = new ArrayList<>();
        presort(root);
        return out;
    }

    private void presort(TreeNode<T> root) {
        if (root != null) {
            out.add(root.getInfo());
            presort(root.getLeft());
            presort(root.getRight());
        }
    }

    public ArrayList<T> listInsort() {
        out = new ArrayList<>();
        insort(root);
        return out;
    }

    private void insort(TreeNode<T> root) {
        if (root != null) {
            insort(root.getLeft());
            out.add(root.getInfo());

            insort(root.getRight());

        }
    }
    public TreeNode<T> findNode(T info ){
        TreeNode<T> aux=root;
        while(aux!=null){
            if(comparator.compare(info,aux.getInfo())==0){
    return aux;
            }
            aux=comparator.compare(info,aux.getInfo())<0?aux.getLeft():aux.getRight();
        }
        return null;
    }
    public ArrayList<T> listPosSort() {
        out = new ArrayList<>();
        PosSort(root);
        return out;
    }

    private void PosSort(TreeNode<T> root) {
        if (root != null) {
            insort(root.getLeft());
            insort(root.getRight());
            out.add(root.getInfo());

        }
    }
    public boolean isLeaf(TreeNode<T> node){
        if(node.getLeft()==null&&node.getRight()==null){
            return true;
        }
        return false;
    }
    public byte gradeNode(TreeNode<T> node){
        return ;
    }
}
