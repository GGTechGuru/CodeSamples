/* Similar to dir
** Author: Gerard Gold
*/

using System;
using System.IO;

class ListClass {

  public static void ListContents ( string dirPath ) {

    Console.WriteLine( "Files:" );

    foreach ( string filePath in Directory.GetFiles( dirPath ) ) {

      Console.WriteLine( filePath );

    }

    Console.WriteLine( "Directories:" );

    foreach ( string filePath in Directory.GetDirectories( dirPath ) ) {

      Console.WriteLine( filePath );

    }

  }
}


class MainProgram {

  public static void Main( string[] args ) {

    if ( args.Length < 1 ) {

      Console.WriteLine( "Unexpected # of arguments to Main(): {0} ", args.Length );

      throw new System.ArgumentException( "Call with name of directory" );
    }

    else {

      string dirPath = args[0];

      Console.WriteLine( "Directory to list: {0}", dirPath );

      ListClass.ListContents( dirPath );

      

    }

  }
}
