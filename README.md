# share-app-plugin

A simple plugin to share your app link in other social Network apps for phonegap/cordova android platform project

## Getting Started

Add the plugin to project using npm

    npm install --save share-app-plugin

or else you can install using plugman (plugman always helps you)

    plugman install --platform android --project (path/of/your/project) --plugin (plugin/file/path or github link)

### Prerequisites

    * Node
    * npm
    * git
    * phonegap
    * Android studio and SDK

### Using the plugin 

SYNTAX

    ```
    Share.addItem(foo,bar,successCallback,errorCallback);
    ```

    where
        foo is the [Type](https://developer.android.com/guide/components/intents-filters#ExampleSend) of intent like "text/plain"
        bar is the 'String' to be shared in other social networks.
        successCallback can be something like / function(){console.log("Hybrid Bridge Success")} /
        errorCallback ca be something like / function(e){console.log("Hybrid Bridge Error" + e)} /

EXAMPLE

    ```
    Share.addItem("text/plain","check my app it is inevitable: app/link/here",function(){console.log("Hybrid Bridge Success")},function(e){console.log("Hybrid Bridge Error" + e)});
    ```

## Built With

* [Phonegap](https://phonegap.com/) - The framework used
* [Plugman](https://cordova.apache.org/docs/en/latest/plugin_ref/plugman.html) - Plugin Management
* [cordova-android](https://cordova.apache.org/docs/en/latest/guide/platforms/android/) - Made for android platform


## Authors

* **Aakash Rajni** - *Initial work* - [AakashRajni](https://github.com/aakashrajni)

See also the list of [contributors](https://github.com/aakashrajni/phonegap-shareapp-plugin/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc