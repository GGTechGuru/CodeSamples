/* Similar to ren
** Author: Gerard Gold
*/

using System;
using System.IO;

class MoveClass {

  public static void RenamePath ( string fromPath, string toPath ) {

    File.Move( fromPath, toPath );

  }
}


class MainProgram {

  public static void Main( string[] args ) {

    if ( args.Length != 2 ) {

      Console.WriteLine( "Unexpected # of arguments to Main(): {0} ", args.Length );

      throw new System.ArgumentException( "Call with from and to paths" );
    }

    else {

      string fromPath =	args[0];
      string toPath =	args[1];

      Console.WriteLine( "Rename from: {0} to {1}", fromPath, toPath );

      MoveClass.RenamePath( fromPath, toPath );

    }

  }
}
