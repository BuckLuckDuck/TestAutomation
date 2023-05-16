(() => {
    let details = [];
    document.querySelectorAll('*').forEach((node) => {
        let computedStyle = window.getComputedStyle(node);
        let boundingBox = node.getBoundingClientRect();
        let attributes = Array.from(node.attributes).map(a => ({name: a.name, value: a.value}));
        let children = Array.from(node.children).map(c => c.tagName);
        details.push({
            tagName: node.tagName,
            id: node.id,
            classes: node.className,
            // styles: computedStyle,
            geometry: boundingBox,
            textContent: node.textContent,
            innerHTML: node.innerHTML,
            attributes: attributes,
            parentElement: node.parentElement ? node.parentElement.tagName : null,
            children: children,
            properties: {
                value: node.value,
                checked: node.checked
            }
        });
    });
    return JSON.stringify(details, null, 2);
})();
