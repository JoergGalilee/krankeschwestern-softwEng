package zufallsgenerator;

public class TesterTester implements ZufallsgeneratorSchnittstelle
{

  public TesterTester()
  {
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getRnd()
  {
    
    return (int)(Math.random()*10+1);
  }

  @Override
  public void setSeed()
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public int getSeed()
  {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void resetSequence()
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void showDialog()
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void forceClose()
  {
    // TODO Auto-generated method stub
    
  }

}
