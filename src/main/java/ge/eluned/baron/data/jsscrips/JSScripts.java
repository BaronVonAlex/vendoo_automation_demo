package ge.eluned.baron.data.jsscrips;

public class JSScripts {
    public static final String
            REMOVE_DIALOG_ELEMENT_SCRIPT =
            """
                        function deleteElementIfAppears(selector) {
                          // Create a MutationObserver (watches for changes in the DOM)
                          const observer = new MutationObserver((mutations) => {
                            mutations.forEach((mutation) => {
                              mutation.addedNodes.forEach((node) => {
                                if (node.nodeType === Node.ELEMENT_NODE && node.matches(selector)) {
                                  // Element matching the selector appeared, delete it
                                  node.remove();\s
                                  observer.disconnect();
                                }
                              });
                            });
                          });
                        
                          // Start observing the entire document
                          observer.observe(document.documentElement, { childList: true, subtree: true });
                        }
                        
                        deleteElementIfAppears('.f0fbe41bfe.b290b28eaf');\s
                    """,
            AXE_RUNNER_SCRIPT = "var callback = arguments[arguments.length - 1]; axe.run().then(results => callback(results));",
            SMOOTH_SCROLL_TO_ELEMENT_SCRIPT = "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});";
}
