/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
   public:
       int findPos(int ele,vector<int>  inorder, int n){
           for(int i=0;i<n;i++){
               if(ele==inorder[i])
                   return i;
           }
           return -1;
           
       }
        TreeNode* solve(vector<int> preorder, vector<int> inorder, int &indexPre,
                     int  inorderStart, int inorderEnd, int n) {
           if(indexPre>=n || inorderStart>inorderEnd)
               return NULL;
            
           int ele= preorder[indexPre];
            indexPre++;
           TreeNode* root= new TreeNode(ele);
            int pos= findPos(ele, inorder, n);
            
            root->left=solve(preorder,inorder, indexPre, inorderStart, pos-1,n);
            root->right=solve(preorder,inorder, indexPre, pos+1,inorderEnd,n);
            return root;
        }
       
       TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
           int indexPre= 0;
           int n=preorder.size();
           TreeNode* ans= solve(preorder,inorder, indexPre, 0, n-1,n);
           return ans;
       }
   };