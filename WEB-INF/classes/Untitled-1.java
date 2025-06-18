
HttpSession hs = request.getSession();
Cart c = (Cart)hs.getAttribute("cart");
if(c==null)
{
    v = new Cart();
    hs.setAttribute("cart",v);
}

ItemDAO dao = new ItemDAO();
int count = dao.getItemCount();
for(int i = 1;i<=count;i++)
{
    String s = request.getParameter("item"+i);
    if(s!=null)
    {
        Item item = dao.getItem(i);
        CartItem cItem = new CartItem("cartItem"+i,item,1);
        //v.add(item);
        c.addCartItem(cartItem);
    }
}